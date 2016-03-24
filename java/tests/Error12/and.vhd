entity and_gate is
       port (X, Y:in bit; Z: out bit);
end;

architecture struct of and_gate is
begin
    Z<= transport X and A after 10 ns;
end;

