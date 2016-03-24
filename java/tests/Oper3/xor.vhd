entity xor_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of xor_gate is
begin
    Z<= transport X xor Y after 10 ns;
end;

