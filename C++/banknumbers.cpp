#include <stdio.h>

const long FONT[] = {0x000fb400, 0x371df39f, 0x145db7fb};

char part(char c, int x, int y)
{
    return (FONT[y] >> (10 * x + c - '0')) & 1 ? "|_|"[x] : ' ';
}

int main(void)
{
    char line[64];
    while (scanf("%63s ", line) == 1) {
        for (int y = 0; y < 3; y++, putchar('\n'))
            for (char *c = line; *c; c++)
                for (int x = 2; x >= 0; x--)
                    putchar(part(*c, x, y));
        putchar('\n');
    }
}
