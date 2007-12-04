/*
 * $Id$
 * Copyright (C) 2002-2007, The Perl Foundation.
 */

#ifndef PARROT_IMCC_INSTRUCTIONS_H_GUARD
#define PARROT_IMCC_INSTRUCTIONS_H_GUARD

/* Types */

enum INSTYPE {    /*instruction type can be   */
    ITBRANCH   =   0x10000, /*  branch        */
    ITPCCRET   =   0x20000, /*  PCC sub return */
    ITCALL     =   0x40000, /*  function call */
    ITLABEL    =   0x80000, /*  label         */
    ITALIAS    =  0x100000, /*  set P,P  */
    ITADDR     =  0x200000, /*  set_addr P, addr*/
    ITRESULT   =  0x400000, /*  .get_results */
    ITEXT      =  0x800000, /*  instruction is extcall in JIT */
    ITSAVES    = 0x1000000, /*  saveall/restoreall in a bsr */
    ITPCCSUB   = 0x2000000, /*  PCC sub call */
    ITPCCYIELD = 0x4000000  /*  yield from PCC call instead of return */
};


typedef struct _Instruction {
    char * op;          /* opstring w/o params */
    char * fmt;         /* printf style format string for params   */
    unsigned int flags; /* how the instruction affects each of the values */
    unsigned int type;  /* 16 bit register branches, + ITxxx */
    int keys;           /* bitmask of keys used in this instruction */
    int index;          /* index on instructions[] */
    int bbindex;        /* number of basic block containing instruction */
    struct _Instruction * prev;
    struct _Instruction * next;
    int opnum;          /* parrot op number */
    int opsize;         /* parrot op size   */
    int line;           /* source code line number */
    int n_r;            /* count of regs in **r */
    SymReg * r[1];      /* instruction is allocated variabled sized
                           to hold more SymRegs */
} Instruction;


/* XXX fix flags [bitmap]
 * int flags_r
 * int flags_w
 * int flags_jump
 */
#define INSTRUCTION_BIT(n) ((UINTVAL)1 << (n))
typedef enum {
    /* Indicate how the instruction affects each of the registers */
    IF_r0_read      = INSTRUCTION_BIT(0),
    IF_r1_read      = INSTRUCTION_BIT(1),
    IF_r2_read      = INSTRUCTION_BIT(2),
    IF_r3_read      = INSTRUCTION_BIT(3),
    /* .... */
    IF_r0_write     = INSTRUCTION_BIT(16),
    IF_r1_write     = INSTRUCTION_BIT(17),
    IF_r2_write     = INSTRUCTION_BIT(18),
    IF_r3_write     = INSTRUCTION_BIT(19),
    /* .... */
    IF_binary       = (IF_r0_write|IF_r1_read|IF_r2_read), /* templ for binary op */
    IF_unary        = (IF_r0_write|IF_r1_read),           /* templ for unary  op */
    IF_inplace      = (IF_r0_write|IF_r0_read),    /* templ for inplace unary  op */
    /* the branch flags are the low 16 bits of type
     * for upper 16 see ITXX above */
    IF_r0_branch    = INSTRUCTION_BIT(0),
    IF_r1_branch    = INSTRUCTION_BIT(1),
    IF_r2_branch    = INSTRUCTION_BIT(2),
    IF_r3_branch    = INSTRUCTION_BIT(3),
    IF_goto         = INSTRUCTION_BIT(15)
} Instruction_Flags;
#undef INSTRUCTION_BIT


/* Forward decl */
struct _IMC_Unit;


/* Functions */
/*
 * _mk_instruction and iANY are not intended for outside usage
 * please use INS
 */
#ifdef _PARSER
Instruction * _mk_instruction(const char *, const char *, int n, SymReg **, int);
#else
#  define _mk_instruction(a, b, n, c, d) dont_use(a, b)
#endif

/* Globals */

typedef struct _emittert {
    int (*open)(PARROT_INTERP, void *param);
    int (*emit)(PARROT_INTERP, void *param, struct _IMC_Unit *, const Instruction *ins);
    int (*new_sub)(PARROT_INTERP, void *param, struct _IMC_Unit *);
    int (*end_sub)(PARROT_INTERP, void *param, struct _IMC_Unit *);
    int (*close)(PARROT_INTERP, void *param);
} Emitter;

enum Emitter_type { EMIT_FILE, EMIT_PBC };

/* HEADERIZER BEGIN: compilers/imcc/instructions.c */

PARROT_API
int emit_close(PARROT_INTERP, NULLOK(void *param))
        __attribute__nonnull__(1);

PARROT_API
int emit_flush(PARROT_INTERP,
    NULLOK(void *param),
    NOTNULL(struct _IMC_Unit *unit))
        __attribute__nonnull__(1)
        __attribute__nonnull__(3);

PARROT_API
int emit_open(PARROT_INTERP, int type, NULLOK(void *param))
        __attribute__nonnull__(1);

PARROT_MALLOC
PARROT_CANNOT_RETURN_NULL
Instruction * _mk_instruction(
    NOTNULL(const char *op),
    NOTNULL(const char *fmt),
    int n,
    SymReg ** r,
    int flags)
        __attribute__nonnull__(1)
        __attribute__nonnull__(2);

Instruction * delete_ins(
    NOTNULL(struct _IMC_Unit *unit),
    NOTNULL(Instruction *ins),
    int needs_freeing)
        __attribute__nonnull__(1)
        __attribute__nonnull__(2);

Instruction * emitb(PARROT_INTERP,
    NULLOK(struct _IMC_Unit *unit),
    NULLOK(Instruction *i))
        __attribute__nonnull__(1);

void free_ins(NOTNULL(Instruction *ins))
        __attribute__nonnull__(1);

SymReg * get_branch_reg(NOTNULL(const Instruction *ins))
        __attribute__nonnull__(1);

int get_branch_regno(NOTNULL(const Instruction *ins))
        __attribute__nonnull__(1);

void imcc_init_tables(PARROT_INTERP)
        __attribute__nonnull__(1);

int ins_print(PARROT_INTERP,
    NOTNULL(FILE *fd),
    NOTNULL(const Instruction *ins))
        __attribute__nonnull__(1)
        __attribute__nonnull__(2)
        __attribute__nonnull__(3);

int ins_reads2(NOTNULL(const Instruction *ins), int t)
        __attribute__nonnull__(1);

int ins_writes2(NOTNULL(const Instruction *ins), int t)
        __attribute__nonnull__(1);

void insert_ins(
    NOTNULL(struct _IMC_Unit *unit),
    NULLOK(Instruction *ins),
    NOTNULL(Instruction *tmp))
        __attribute__nonnull__(1)
        __attribute__nonnull__(3);

int instruction_reads(
    NOTNULL(const Instruction *ins),
    NOTNULL(const SymReg *r))
        __attribute__nonnull__(1)
        __attribute__nonnull__(2);

int instruction_writes(
    NOTNULL(const Instruction *ins),
    NOTNULL(const SymReg *r))
        __attribute__nonnull__(1)
        __attribute__nonnull__(2);

Instruction * move_ins(
    NOTNULL(struct _IMC_Unit *unit),
    NOTNULL(Instruction *ins),
    NOTNULL(Instruction *to))
        __attribute__nonnull__(1)
        __attribute__nonnull__(2)
        __attribute__nonnull__(3);

void prepend_ins(
    NOTNULL(struct _IMC_Unit *unit),
    NULLOK(Instruction *ins),
    NOTNULL(Instruction *tmp))
        __attribute__nonnull__(1)
        __attribute__nonnull__(3);

void subst_ins(
    NOTNULL(struct _IMC_Unit *unit),
    NOTNULL(Instruction *ins),
    NOTNULL(Instruction *tmp),
    int needs_freeing)
        __attribute__nonnull__(1)
        __attribute__nonnull__(2)
        __attribute__nonnull__(3);

/* HEADERIZER END: compilers/imcc/instructions.c */

#endif /* PARROT_IMCC_INSTRUCTIONS_H_GUARD */


/*
 * Local variables:
 *   c-file-style: "parrot"
 * End:
 * vim: expandtab shiftwidth=4:
 */

