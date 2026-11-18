def temperature():
    print("""
    1.C  
    2.F
    """)
    
    value = 45
    
    temperature_1 = (value - 32) * 5/9
    temperature_2 = (value * 9/5) + 32
    
    temperature_option = input("choose option (C or F): ")
    match (temperature_option):
        case "C":
            print(temperature_1, "F")
        case "F":
            print(temperature_2, "C")
            
temperature()
