entity clock is
       port (Z: out bit);
end;

architecture struct of clock is
begin
    Z<= transport not Z after 10 ns;
end;

