entity ff is
       port (R, S:in bit; Q, NQ: out bit);
end;

architecture struct of ff is
begin
    Q<= transport R nor NQ after 1 ns;
    NQ<= transport S nor Q after 1 ns; 
end;

