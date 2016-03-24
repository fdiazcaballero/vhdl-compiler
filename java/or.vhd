entity or_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of or_gate is
begin
    Z<= transport X or Y after 10 ns;
end;

