entity ff_flanco is
       port (J, K:in bit; Q, NQ: out bit);
end;

architecture struct of ff_flanco is
signal QM, NQM, C, NC, G1, G2, A, G3, G4: bit;
begin
    C <= transport not C after 20 ns;
    NC <= transport not C after 1 ns;
    G1 <= transport not (NQ and J and C) after 1 ns;
    G2 <= transport not (Q and K and C) after 1 ns;
    QM <= transport NQM nand G1 after 1 ns;
    NQM <= transport QM nand G2 after 2 ns;
    G3 <= transport QM nand NC after 1 ns;
    G4 <= transport NQM nand NC after 1 ns;
    Q <= transport G3 nand NQ after 1 ns;
    NQ <= transport G4 nand Q after 1 ns;

end;

