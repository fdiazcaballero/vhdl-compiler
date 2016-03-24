entity nand_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of nand_gate is
begin
    Z<= transport X nand Y after 10 ns;
end;

