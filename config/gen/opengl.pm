# Copyright (C) 2008, The Perl Foundation.
# $Id$

=head1 NAME

config/gen/opengl.pm - OpenGL binding generated files

=head1 DESCRIPTION

Generates several files used by the OpenGL binding.  These include:

=over 4

=item F<runtime/parrot/include/opengl_defines.pasm>

=item F<runtime/parrot/library/OpenGL_funcs.pir>

=item F<config/gen/call_list/opengl.in>

=item F<src/glut_callbacks.c>

=back

For information about Parrot's OpenGL support on different platforms, and
system libraries/headers that must be installed to enable OpenGL support,
see L<config/auto/opengl.pm>, where this support is detected.

=cut

package gen::opengl;

use strict;
use warnings;
use File::Glob;

use base qw(Parrot::Configure::Step);

use Parrot::Configure::Utils ':gen';


my @GLUT_1_CALLBACKS = (
    [ 'Display',          'void' ],
    [ 'Idle',             'void' ],
    [ 'Entry',            'int state' ],
    [ 'Menu State',       'int status' ],
    [ 'Visibility',       'int state' ],
    [ 'Motion',           'int x, int y' ],
    [ 'Passive Motion',   'int x, int y' ],
    [ 'Reshape',          'int width, int height' ],
    [ 'Keyboard',         'unsigned char key, int x, int y' ],
    [ 'Mouse',            'int button, int state, int x, int y' ],

    # NOTE: Hardcoded because of special arguments
    # [ 'Timer',            'int data' ],
);

my @GLUT_2_CALLBACKS = (
    [ 'Button Box',       'int button, int state' ],
    [ 'Dials',            'int dial, int value' ],
    [ 'Spaceball Button', 'int button, int state' ],
    [ 'Tablet Motion',    'int x, int y' ],
    [ 'Spaceball Motion', 'int x, int y, int z' ],
    [ 'Spaceball Rotate', 'int x, int y, int z' ],
    [ 'Special',          'int key, int x, int y' ],
    [ 'Tablet Button',    'int button, int state, int x, int y' ],
);

my @GLUT_3_CALLBACKS = (
    [ 'Overlay Display',  'void' ],
    [ 'Menu Status',      'int status, int x, int y' ],
);

my @GLUT_4_CALLBACKS = (
    [ 'Window Status',    'int state' ],
    [ 'Keyboard Up',      'unsigned char key, int x, int y' ],
    [ 'Special Up',       'int key, int x, int y' ],

    # NOTE: Hardcoded because of special arguments
    # [ 'Joystick',         'int buttons, int xaxis, int yaxis, int zaxis' ],
);

my @MACOSXGLUT_CALLBACKS = (
    # Also works in freeglut
    [ 'WM Close',         'void' ],
);

my @FREEGLUT_CALLBACKS = (
    [ 'Close',            'void' ],
    [ 'Menu Destroy',     'void' ],
    [ 'Mouse Wheel',      'int wheel, int direction, int x, int y' ],
);

my %C_TYPE = (
    GLvoid                  => 'void',
    GLUnurbs                => 'void',
    GLUquadric              => 'void',
    GLUtesselator           => 'void',
    gleGC                   => 'void',
    muiObject               => 'void',
    SphereMap               => 'void',
    Display                 => 'void',
    XVisualInfo             => 'void',
    _CGLContextObject       => 'void',
    GLXHyperpipeConfigSGIX  => 'void',
    GLXHyperpipeNetworkSGIX => 'void',

    wchar_t                 => 'void',

    GLXContext              => 'void*',
    GLXFBConfig             => 'void*',
    GLXFBConfigSGIX         => 'void*',
    CGLContextObj           => 'void*',
    CGLPixelFormatObj       => 'void*',
    CGLRendererInfoObj      => 'void*',
    CGLPBufferObj           => 'void*',

    GLchar                  => 'char',
    GLcharARB               => 'char',
    GLbyte                  => 'signed char',
    GLubyte                 => 'unsigned char',
    GLboolean               => 'unsigned char',

    GLshort                 => 'short',
    GLushort                => 'unsigned short',
    GLhalfARB               => 'unsigned short',
    GLhalfNV                => 'unsigned short',

    Bool                    => 'int',
    Status                  => 'int',
    GLint                   => 'int',
    GLsizei                 => 'int',
    int32_t                 => 'int',

    GLenum                  => 'unsigned int',
    CGLPixelFormatAttribute => 'unsigned int',
    CGLRendererProperty     => 'unsigned int',
    CGLContextEnable        => 'unsigned int',
    CGLContextParameter     => 'unsigned int',
    CGLGlobalOption         => 'unsigned int',
    CGLError                => 'unsigned int',
    SphereMapFlags          => 'unsigned int',

    GLuint                  => 'unsigned int',
    GLbitfield              => 'unsigned int',
    GLhandleARB             => 'unsigned int',
    GLXVideoDeviceNV        => 'unsigned int',

    XID                     => 'unsigned long',
    Window                  => 'unsigned long',
    Drawable                => 'unsigned long',
    Font                    => 'unsigned long',
    Pixmap                  => 'unsigned long',
    Cursor                  => 'unsigned long',
    Colormap                => 'unsigned long',
    GContext                => 'unsigned long',
    KeySym                  => 'unsigned long',
    GLXContextID            => 'unsigned long',
    GLXPixmap               => 'unsigned long',
    GLXDrawable             => 'unsigned long',
    GLXPbuffer              => 'unsigned long',
    GLXWindow               => 'unsigned long',
    GLXFBConfigID           => 'unsigned long',
    GLXPbufferSGIX          => 'unsigned long',
    GLXFBConfigIDSGIX       => 'unsigned long',
    GLXVideoSourceSGIX      => 'unsigned long',

    int64_t                 => 'long long',
    GLint64EXT              => 'signed long long',
    GLuint64EXT             => 'unsigned long long',

    GLfloat                 => 'float',
    GLclampf                => 'float',
    GLdouble                => 'double',
    GLclampd                => 'double',
    gleDouble               => 'double',

    GLintptr                => 'ptrdiff_t',
    GLsizeiptr              => 'ptrdiff_t',
    GLintptrARB             => 'ptrdiff_t',
    GLsizeiptrARB           => 'ptrdiff_t',
);

my %NCI_TYPE = (
    void         => 'v',
    char         => 'c',
    short        => 's',
    int          => 'i',
    long         => 'l',
    size_t       => 'l',
    ptrdiff_t    => 'l',
    # Requires RT 53406
    # longlong     => 'L',
    float        => 'f',
    double       => 'd',

    'char*'      => 't',

    'short*'     => 'p',
    'int*'       => 'p',
    'long*'      => 'p',
    'longlong*'  => 'p',
    'float*'     => 'p',
    'double*'    => 'p',
    'void*'      => 'p',

    'char**'     => 'p',
    'short**'    => 'p',
    'int**'      => 'p',
    'long**'     => 'p',
    'longlong**' => 'p',
    'float**'    => 'p',
    'double**'   => 'p',
    'void**'     => 'p',

    'double***'  => 'p',
);

my %OVERRIDE = (
    'glutInit'  => 'v3p',
);

my @IGNORE = (
    # Most of these are limitations of this module or Parrot NCI

    # Don't handle GetProcAddress type functions yet
    'glutGetProcAddress',
    'glXGetProcAddress',
    'glXGetProcAddressARB',

    # Don't handle this odd create/callback register function yet
    'glutCreateMenu',

    # Don't handle Mesa, GLU, or MUI callbacks yet
    'glProgramCallbackMESA',
    'gluNurbsCallback',
    'gluQuadricCallback',
    'gluTessCallback',
    'muiSetCallback',
    'muiSetNonMUIcallback',
    'handler',
    'callback',

    # Don't handle functions without "namespace" prefixes matching library
    'rot_axis',
    'rot_about_axis',
    'rot_omega',
    'rot_prince',
    'urot_axis',
    'urot_about_axis',
    'urot_omega',
    'urot_prince',
    'uview_direction',
    'uviewpoint',

    # Can't handle longlong until RT 53406 is done
    'glPresentFrameKeyedNV',
    'glPresentFrameDualFillNV',
    'glXSwapBuffersMscOML',
    'glXWaitForMscOML',
    'glXWaitForSbcOML',

    # Can't handle weird data types specified only in proprietary headers
    'glXCreateGLXVideoSourceSGIX',
    'glXAssociateDMPbufferSGIX',

    # Ignore internal GLUT Win32 compatibility hackage
    'exit',
);

my @SKIP = (
    # Apple CGL OpenGL API conversion macros
    'CGLMacro.h',

    # Internal headers for GLE (OpenGL Extrusions) library
    'extrude.h',
    'segment.h',

    # Rotation math utility functions from GLE
    'gutil.h',

    # Plane math utility functions/macros from GLE
    'intersect.h',

    # MUI (internal?) headers lacking "namespace" identifier prefixes
    'browser.h',
    'gizmo.h',
    'hslider.h',
    'vslider.h',
);

my $MACRO_FILE = 'runtime/parrot/include/opengl_defines.pasm';
my $FUNCS_FILE = 'runtime/parrot/library/OpenGL_funcs.pir';
my $SIGS_FILE  = 'config/gen/call_list/opengl.in';
my $C_FILE     = 'src/glut_callbacks.c';


sub _init {
    my $self = shift;

    return {
        description => q{Generating OpenGL bindings},
        result      => q{},
    }
}

sub runstep {
    my ($self, $conf) = @_;

    unless ($conf->data->get('has_opengl')) {
        $self->set_result('skipped');
        return 1;
    }

    my $verbose = $conf->options->get('verbose') || 0;

    my @include_paths_win32 = grep /\S/ => split /;/ => ($ENV{INCLUDE} || '');

    s{\\}{/}g foreach @include_paths_win32;

    my @header_globs = (
        # Default location for most UNIX-like platforms
        '/usr/include/GL/*.h',

        # Mac OS X
        '/System/Library/Frameworks/OpenGL.framework/Headers/*.h',
        '/System/Library/Frameworks/GLUT.framework/Headers/*.h',

        # Windows/MSVC
        (map "$_/gl/*.h" => @include_paths_win32),

#         "$ENV{HOME}/src/osx/headers/GLUT/*.h",
#         "$ENV{HOME}/src/osx/headers/OpenGL/*.h",
#         "$ENV{HOME}/src/osx-10.4/GLUT/*.h",
#         "$ENV{HOME}/src/osx-10.4/OpenGL/*.h",
#         "$ENV{HOME}/src/cygwin/opengl-1.1.0/GLUI_v2_1_beta/*.h",
#         "$ENV{HOME}/src/cygwin/opengl-1.1.0/glut-3.7.3/include/GL/*.h",
#         "$ENV{HOME}/src/cygwin/opengl-1.1.0/glut-3.7.3/include/mui/*.h",
#         "$ENV{HOME}/src/glut-3.7.6/include/GL/*.h",
#         "$ENV{HOME}/src/glut-3.7.6/include/mui/*.h",
    );

    my @header_files = sort map {File::Glob::bsd_glob($_)} @header_globs;

    my %skip = map {($_ => 1)} @SKIP;
    @header_files = grep {my ($file) = m{([^/]+)$}; !$skip{$file}} @header_files;

    die "OpenGL enabled and detected, but no OpenGL headers found!"
        unless @header_files;

    my $autogen_header = <<'HEADER';
# DO NOT EDIT THIS FILE.
#
# Any changes made here will be lost.
#
# This file is generated automatically by config/gen/opengl.pm
# using the following files:
#
HEADER

    $autogen_header .= "# $_\n" foreach @header_files;

    $self->gen_opengl_defines ($conf, \@header_files, $autogen_header, $verbose);
    $self->gen_opengl_wrappers($conf, \@header_files, $autogen_header, $verbose);
    $self->gen_glut_callbacks ($conf);

    return 1;
}

sub gen_opengl_defines {
    my ($self, $conf, $header_files, $autogen_header, $verbose) = @_;

    my (%defs, @macros);
    my $max_len = 0;

    foreach my $file (@$header_files) {
        open my $header, '<', $file
        or die "Could not open header '$file': $!";

        while (<$header>) {
            my (@F) = split;
            next unless @F > 2 and $F[0] eq '#define';
            next unless $F[1] =~ /^(AGL|CGL|WGL|GLX|MUI|SMAP|TUBE|GL[A-Z]*)_/;
            next if     $F[1] =~ /\(/;

            $max_len = length $F[1] if $max_len < length $F[1];

            my $api = $1;
            if ($F[2] =~ /^(?:[ACW])?GL/) {
                push @macros, [$api, $F[1], $F[2]];
            }
            elsif (   $F[2] =~ /^0x[0-9a-fA-F]+$/
                   || $F[2] =~ /^\d+(?:\.\d*)?(?:e\d+)?$/) {
                $defs{$api}{$F[1]} = $F[2];
            }
            else {
                print "\nUnable to parse '$F[2]'\n" if $verbose;
            }
        }
    }

    foreach my $macro (@macros) {
        my ($api, $define, $value) = @$macro;
        my ($val_api) = $value =~ /^((?:[ACW])?GL[A-Z]*)_/;

        $defs{$api}{$define} = $defs{$val_api}{$value};

        die "'$define' is defined as '$value', but no '$value' has been defined"
        unless defined $defs{$val_api}{$value};
    }

    open my $macros, '>', $MACRO_FILE
        or die "Could not open macro file '$MACRO_FILE' for write: $!";

    print $macros $autogen_header;
    print $macros "\n\n";

    foreach my $api (sort keys %defs) {
        my $api_defs = $defs{$api};

        foreach my $define (sort keys %$api_defs) {
        printf $macros ".macro_const %-${max_len}s %s\n",
                       $define, $api_defs->{$define};
        }
    }

    $conf->append_configure_log($MACRO_FILE);

    return 1;
}

sub gen_opengl_wrappers {
    my ($self, $conf, $header_files, $autogen_header, $verbose) = @_;

    my %IGNORE = map {($_ => 1)} @IGNORE;

    my (%pass, %fail, %ignore, %sigs, %funcs);

    # PHASE 1: Parse Headers
    foreach my $file (@$header_files) {
        open my $header, '<', $file
            or die "Could not open header '$file': $!";

      PROTO:
        while (<$header>) {
            # Get rid of C comments
            s{/\*.*?\*/}{}g;
            if (m{/\*}) {
                chomp;
                $_ .= <$header>;
                redo;
            }

            # Make sure the entire parameter list is on a single line
            next unless /\(/;
            unless (/\)/) {
                chomp;
                $_ .= <$header>;
                redo;
            }

            # We only care about regular function prototypes
            next unless /API/ or /\bextern\b/ or /\bmui[A-Z]/;
            next if     /^#/;
            next if     /\btypedef\b/;

            # Save a (space compressed) copy of the source line
            # for later error reporting
            my $orig =  $_;
               $orig =~ s/\s+/ /g;
               $orig =~ s/ $/\n/;

            # Get rid of junk needed for C, but not for Parrot NCI;
            # also do general cleanup to make parsing easier
            s/\bAVAILABLE_MAC_OS_X_VERSION_\d+_\d+_AND_LATER\b\s*//;
            s/\b__cdecl\b\s*//;
            s/\b__stdcall\b\s*//;
            s/\b_CRTIMP\b\s*//;
            s/\bextern\b\s*//;
            s/\bstatic\b\s*//;
            s/\bconst\b\s*//g;
            s/\benum\b\s*//g;
            s/\bstruct\b\s*//g;
            s/\b[A-Z]*API[A-Z]*\s*//g;
            s/\s*\*\s*/* /g;
            s/\* \*/**/g;
            s/\s*,\s*/, /g;
            s/\s*\(\s*/(/g;
            s/\s*\)\s*/)/g;
            s/\s+/ /g;
            s/\s+$//;
            s/^\s+//;

            # Canonicalize types
            s/\b(\w+)\b/$C_TYPE{$1} || $1/eg;
            s/\b(?:un)?signed //g;
            s/\blong long\b/longlong/g;

            # Parse the function prototype, trying hard to capture name
            my ($return, $name, $params) = /^(\w+\**) (\w+)\(([^)]*)\);$/;
            ($name) = /^\w+\(?\** (\w+)\)?/ unless defined $name;

            # Is this a function we're ignoring for now or handling elsewhere?
            if (defined $name) {
                # Callback reg functions handled by gen_*_callbacks()
                $pass  {$file}++, next if /\bglut[A-Z][a-zA-Z]+Func\b/;
                $ignore{$file}++, next if /\bsmap[A-Z][a-zA-Z]+Func\b/;

                # Ignore all library-internal functions
                $ignore{$file}++, next if $name =~ /^__/;
                $ignore{$file}++, next if $name =~ /_ATEXIT_HACK$/;

                # Miscellaneous ignores
                $ignore{$file}++, next if $IGNORE{$name};
            }

            # Successful parse?
            unless (defined $return and defined $name and defined $params) {
                $fail{$file}++;
                $name ||= '';
                warn "In OpenGL header '$file', can't parse canonicalized prototype for '$name':\n  $_\nOriginal prototype:\n  $orig\n";
                next;
            }

            # Figure out what group/library this function belongs to
            my ($group) = $name =~ /^(agl|CGL|wgl|glX|mui|smap|gl[a-z]*)/;

            unless ($group) {
                $fail{$file}++;
                warn "In OpenGL header '$file', found a non-OpenGL function: '$name'\n";
                next;
            }

            $group = lc $group;

            # Convert return and param types to NCI signature
            my $nci_sig = $OVERRIDE{$name};

            unless ($nci_sig) {
                $params = '' if $params eq 'void';
                my @params = split /, / => $params;
                unshift @params, $return;

                foreach my $param (@params) {
                    1 while $param =~ s/(\w+\**) (\w+)\s*\[\d*\]/$1* $2/;
                    $param =~ s/ \w+$// unless $NCI_TYPE{$param};
                    unless ($NCI_TYPE{$param}) {
                        $fail{$file}++;
                        warn "In OpenGL header '$file', prototype '$name', can't handle type '$param'; original prototype:\n  $orig\n";
                        next PROTO;
                    }
                    $nci_sig .= $NCI_TYPE{$param};
                }

                if ($nci_sig =~ /.v/) {
                    $fail{$file}++;
                    warn "In OpenGL header '$file', prototype '$name', there is a void parameter; original prototype:\n  $orig\n";
                    next PROTO;
                }
            }

            # Success!  Save results.
            $pass{$file}++;
            $sigs{$nci_sig}++;
            push @{$funcs{$group}}, [$name, $nci_sig];

            print "$group\t$nci_sig\t$return $name($params);\n" if $verbose >= 3;
        }
    }

    # PHASE 2: Write unique signatures to NCI signatures file
    my @sigs = sort keys %sigs;

    open my $sigs, '>', $SIGS_FILE
        or die "Could not open NCI signatures file '$SIGS_FILE' for write: $!";

    print $sigs <<"HEADER";
# Used by OpenGL (including GLU and GLUT)
#
$autogen_header

# GLUT callbacks
v    JP
v    JPi
v    JPii

# Generated signatures
HEADER

    foreach my $nci_sig (@sigs) {
        my ($return, $params) = $nci_sig =~ /^(.)(.*)$/;

        print $sigs "$return    $params\n";
    }

    close $sigs;
    $conf->append_configure_log($SIGS_FILE);

    # PHASE 3: Write function lists for each OpenGL-related library

    open my $funcs, '>', $FUNCS_FILE
        or die "Could not open function list file '$FUNCS_FILE' for write: $!";

    print $funcs $autogen_header;
    print $funcs <<'GLUTCB_FUNCS';


.sub _glutcb_func_list
    .local pmc glutcb_funcs
    glutcb_funcs = new 'ResizableStringArray'
    push glutcb_funcs, 'glutcbCloseFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbDisplayFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbIdleFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMenuDestroyFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbOverlayDisplayFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbWMCloseFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbEntryFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMenuStateFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbVisibilityFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbWindowStatusFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbButtonBoxFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbDialsFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMotionFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbPassiveMotionFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbReshapeFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbSpaceballButtonFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbTabletMotionFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbKeyboardFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbKeyboardUpFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMenuStatusFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbSpaceballMotionFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbSpaceballRotateFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbSpecialFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbSpecialUpFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMouseFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbMouseWheelFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbTabletButtonFunc'
    push glutcb_funcs, 'vJP'
    push glutcb_funcs, 'glutcbTimerFunc'
    push glutcb_funcs, 'vJPii'
    push glutcb_funcs, 'glutcbJoystickFunc'
    push glutcb_funcs, 'vJPi'

    .return (glutcb_funcs)
.end
GLUTCB_FUNCS

    foreach my $group (sort keys %funcs) {
        my $sub_name  = "_${group}_func_list";
        my $list_name = "${group}_funcs";

        print $funcs <<"SUB_HEADER";


.sub $sub_name
    .local pmc $list_name
    $list_name = new 'ResizableStringArray'

SUB_HEADER

        my @funcs = sort {$a->[0] cmp $b->[0]} @{$funcs{$group}};
        foreach my $func (@funcs) {
            my ($name, $sig) = @$func;

            print $funcs <<"FUNCTION"
    push $list_name, '$name'
    push $list_name, '$sig'
FUNCTION
        }
        print $funcs <<"SUB_FOOTER";

    .return ($list_name)
.end
SUB_FOOTER
    }

    close $funcs;
    $conf->append_configure_log($FUNCS_FILE);

    # PHASE 4: Print statistical info on parse results if verbose
    if ($verbose) {
        print "\nPASS  FAIL  IGNORE   HEADER\n";
        foreach my $file (@$header_files, 'TOTAL') {
            my $pass   = $pass  {$file} || 0;
            my $fail   = $fail  {$file} || 0;
            my $ignore = $ignore{$file} || 0;

            printf "%4d  %4d  %4d     %s\n", $pass, $fail, $ignore, $file;

            $pass  {TOTAL} += $pass;
            $fail  {TOTAL} += $fail;
            $ignore{TOTAL} += $ignore;
        }

        print "\nCOUNT   NCI SIGNATURE\n" if $verbose >= 2;
        foreach my $nci_sig (@sigs, 'TOTAL') {
            printf "%5d   %s\n", $sigs{$nci_sig}, $nci_sig if $verbose >= 2;
            $sigs{TOTAL} += $sigs{$nci_sig};
        }

        printf "\n===> %d unique signatures successfully translated.\n",
               scalar @sigs
    }

    return 1;
}

sub gen_glut_callbacks {
    my ( $self, $conf ) = @_;

    my $glut_api   = $conf->data->get('has_glut');
    my $glut_brand = $conf->data->get('glut_brand');

    my   @glut_callbacks = @GLUT_1_CALLBACKS;
    push @glut_callbacks,  @GLUT_2_CALLBACKS     if $glut_api   >= 2;
    push @glut_callbacks,  @GLUT_3_CALLBACKS     if $glut_api   >= 3;
    push @glut_callbacks,  @GLUT_4_CALLBACKS     if $glut_api   >= 4;
    push @glut_callbacks,  @FREEGLUT_CALLBACKS   if $glut_brand eq 'freeglut';
    push @glut_callbacks,  @MACOSXGLUT_CALLBACKS if $glut_brand eq 'freeglut'
                                                 or $glut_brand eq 'MacOSX_GLUT';

    my $glut_header = $glut_brand eq 'MacOSX_GLUT' ? 'GLUT/glut.h'   :
                      $glut_brand eq 'OpenGLUT'    ? 'GL/openglut.h' :
                      $glut_brand eq 'freeglut'    ? 'GL/freeglut.h' :
                                                     'GL/glut.h'     ;

    my @callbacks;
    foreach my $raw (@glut_callbacks) {
        my ($friendly, $params) = @$raw;

        my $args   =  $params;
           $args   =~ s/void//;
           $args   =~ s/(^|, )(\w+ )+/$1/g;
           $args   =  ", $args" if $args;
        my $proto  =  $params;
           $proto  =~ s/ \w+(,|$)/$1/g;
        my $sig    =  $proto;
           $sig    =~ s/void//;
           $sig    =~ s/unsigned //;
           $sig    =~ s/(\w)\w+\W*/$1/g;
           $sig    =  "v$sig";

        my $glutcb =  "glutcb${friendly}Func";
           $glutcb =~ s/ //g;
        my $glut   =  $glutcb;
           $glut   =~ s/glutcb/glut/;
        my $thunk  =  'glut_'    . lc($friendly) . '_func';
           $thunk  =~ s/ /_/g;
        my $enum   =  'GLUT_CB_' . uc($friendly);
           $enum   =~ s/ /_/g;

        push @callbacks, {
            friendly  => $friendly,
            params    => $params,
            proto     => $proto,
            args      => $args,
            sig       => $sig,
            glutcb    => $glutcb,
            glut      => $glut,
            thunk     => $thunk,
            enum      => $enum,
        };
    }

    my $enums     = '';
    my $thunks    = '';
    my $reg_funcs = '';
    my $std_cbs   = '';

   foreach (@callbacks) {
        $enums     .= "    $_->{enum},\n";
        $thunks    .= "                     void $_->{thunk}($_->{proto});\n";
        $reg_funcs .= "PARROT_DYNEXT_EXPORT void $_->{glutcb}(Parrot_Interp, PMC *);\n";
   }

    my $header = <<"HEADER";
/*
# DO NOT EDIT THIS FILE.
#
# Any changes made here will be lost.
#
# This file is generated automatically by config/gen/opengl.pm

Copyright (C) 2008, The Perl Foundation.

=head1 NAME

$C_FILE - GLUT Callback Function Handling

=head1 DESCRIPTION

GLUT callbacks are always synchronous and have void return type.  None
of them accept user data parameters, so normal Parrot callback handling
cannot be used.

=head2 Functions

=over 4

=cut

*/

#define PARROT_IN_EXTENSION

#include <$glut_header>
#include "parrot/parrot.h"


typedef enum {
$enums
    GLUT_CB_TIMER,

#if GLUT_API_VERSION >= 4
    GLUT_CB_JOYSTICK,
#endif

    GLUT_NUM_CALLBACKS
} GLUT_CALLBACKS;

typedef struct GLUT_CB_data {
    Parrot_Interp  interp;
    PMC            *sub;
} GLUT_CB_data;

GLUT_CB_data callback_data[GLUT_NUM_CALLBACKS];


                     int  is_safe(Parrot_Interp, PMC *);

                     void glut_timer_func(int);
PARROT_DYNEXT_EXPORT void glutcbTimerFunc(Parrot_Interp, PMC *, unsigned int, int);

#if GLUT_API_VERSION >= 4
                void glut_joystick_func(unsigned int, int, int, int);
PARROT_DYNEXT_EXPORT void glutcbJoystickFunc(Parrot_Interp, PMC *, int);
#endif

$thunks
$reg_funcs

/* Make sure that interp and sub are sane before running callback sub */
/* XXXX: Should this do the moral equivalent of PANIC? */
int
is_safe(PARROT_INTERP, PMC *sub)
{
    /* XXXX: Verify that interp still exists */

    /* XXXX: Verify that sub exists in interp */

    return PMC_IS_NULL(sub) ? 0 : 1;
}


/*

# glutTimerFunc and glutJoystickFunc must be hardcoded because they have
# special timer-related arguments that do not follow the template of all
# of the other GLUT callbacks

=item C<void glutcbTimerFunc(PARROT_INTERP, sub, milliseconds, data)>

Register a Sub PMC to handle GLUT Timer callbacks.

=cut

*/

void
glut_timer_func(int data)
{
    Parrot_Interp interp = callback_data[GLUT_CB_TIMER].interp;
    PMC           *sub   = callback_data[GLUT_CB_TIMER].sub;

    if (is_safe(interp, sub))
        Parrot_runops_fromc_args_event(interp, sub, "vi", data);
}

PARROT_DYNEXT_EXPORT
void
glutcbTimerFunc(PARROT_INTERP, PMC *sub, unsigned int milliseconds, int data)
{
    callback_data[GLUT_CB_TIMER].interp = interp;
    callback_data[GLUT_CB_TIMER].sub    = sub;

    if (sub == PMCNULL)
        glutTimerFunc(0, NULL, 0);
    else
        glutTimerFunc(milliseconds, glut_timer_func, data);
}


#if GLUT_API_VERSION >= 4
/*

=item C<void glutcbJoystickFunc(PARROT_INTERP, sub, pollinterval)>

Register a Sub PMC to handle GLUT Joystick callbacks.

=cut

*/

void
glut_joystick_func(unsigned int buttons, int xaxis, int yaxis, int zaxis)
{
    Parrot_Interp interp = callback_data[GLUT_CB_JOYSTICK].interp;
    PMC           *sub   = callback_data[GLUT_CB_JOYSTICK].sub;

    if (is_safe(interp, sub))
        Parrot_runops_fromc_args_event(interp, sub, "viiii", buttons, xaxis, yaxis, zaxis);
}

PARROT_DYNEXT_EXPORT
void
glutcbJoystickFunc(PARROT_INTERP, PMC *sub, int pollinterval)
{
    callback_data[GLUT_CB_JOYSTICK].interp = interp;
    callback_data[GLUT_CB_JOYSTICK].sub    = sub;

    if (sub == PMCNULL)
        glutJoystickFunc(NULL, 0);
    else
        glutJoystickFunc(glut_joystick_func, pollinterval);
}
#endif
HEADER


    foreach (@callbacks) {
        $std_cbs   .= <<"IMPLEMENTATION"


/*

=item C<void $_->{glutcb}(PARROT_INTERP, sub)>

Register a Sub PMC to handle GLUT $_->{friendly} callbacks.

=cut

*/

void
$_->{thunk}($_->{params})
{
    Parrot_Interp interp = callback_data[$_->{enum}].interp;
    PMC           *sub   = callback_data[$_->{enum}].sub;

    if (is_safe(interp, sub))
        Parrot_runops_fromc_args_event(interp, sub, "$_->{sig}"$_->{args});
}

PARROT_DYNEXT_EXPORT
void
$_->{glutcb}(PARROT_INTERP, PMC *sub)
{
    callback_data[$_->{enum}].interp = interp;
    callback_data[$_->{enum}].sub    = sub;

    if (sub == PMCNULL)
        $_->{glut}(NULL);
    else
        $_->{glut}($_->{thunk});
}
IMPLEMENTATION
    }


    my $footer = <<'FOOTER';

/*

=back

=cut

*/
FOOTER


    ###
    ### ACTUALLY WRITE FILE
    ###

    open my $c_file, '>', $C_FILE
        or die "Could not open '$C_FILE' for write: $!";

    print $c_file $header;
    print $c_file $std_cbs;
    print $c_file $footer;

    $conf->append_configure_log($C_FILE);


    return 1;
}

1;

# Local Variables:
#   mode: cperl
#   cperl-indent-level: 4
#   fill-column: 100
# End:
# vim: expandtab shiftwidth=4:
