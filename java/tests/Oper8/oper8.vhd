entity oper8 is
       port (X, Y, A:in bit; Z1, Z2, Z3: out bit);
end;

architecture struct of oper8 is
begin
    Z1<= transport ((X and Y) or A) and ((X nor A) nand (X xor Y)) 
    after 10 ns;
    Z2<= transport (X nand Y) nor A after 10 ns;
    Z3<= transport (X nor Y) nand A after 10 ns;
    
end;

