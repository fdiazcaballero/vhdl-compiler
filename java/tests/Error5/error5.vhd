entity oper7 is
       port (X, Y, A:in bit; Z1, Z2, Z3, Z4, Z5, Z6, Z7, Z8,
       Z9, Z10, Z11, Z12: out bit);
end;

architecture struct of oper7 is
begin
    Z1<= transport X xor Y xor A after 10 ns;
    Z2<= transport X or Y or A after 10 ns;
    Z3<= transport X and Y and A after 10 ns;
    Z4<= transport (X and Y or A after 10 ns;
    Z5<= transport X xor Y xor '1' after 10 ns;
    Z6<= transport '1' after 30 ns;
    Z7<= transport '0' after 30 ns;
    Z8<= transport Z6 after 10 ns;
    Z9<= transport Z7 after 10 ns;
    Z10<= transport X and not Z6 after 1 ns;
    Z11<= transport not Z6 and X after 1 ns;
    Z12<= transport not not not Z6 and X after 1 ns;
    
end;

