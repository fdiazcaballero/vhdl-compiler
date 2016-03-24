entity not_gate is
       port (X:in bit; Z: out bit);
end;

architecture struct of not_gate is
begin
    Z<= transport not X after 10 ns;
end;

