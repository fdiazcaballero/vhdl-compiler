entity and_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of and_gate is
signal Z: bit;
begin
    Z<= transport X and Y after 10 ns;
end;

