ARRAY = [2,6,34,5,1,7,8,26,9,11]
loop FIRST from 0 to 9
    LEAST = FIRST
    loop CURRENT from FIRST+1 to 9
        if ARRAY[CURRENT] < ARRAY[LEAST] then
           LEAST = CURRENT
        end if
    end loop	  
    TEMP = ARRAY[LEAST]
    ARRAY[LEAST] = ARRAY[FIRST]
    ARRAY[FIRST] = TEMP
end loop
loop I from 0 to 9
    output ARRAY[I]
end loop
