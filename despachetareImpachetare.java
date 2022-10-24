public class despachetareImpachetare {
    int varsta,sex,inaltime;
    short impachetat;
    impachetat=(short)((((varsta<<1) | sex)<<8) | inaltime);
    inaltime=impachetat & 0xff;
    sex=(impachetat >>> 8) & 1;
    varsta=(impachetat >>>9) & 0x7f;
}
