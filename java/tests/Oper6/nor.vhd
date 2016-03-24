entity nor_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of nor_gate is
begin
    Z<= transport X nor Y after 10 ns;
end;

