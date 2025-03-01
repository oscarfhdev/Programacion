def coin_flip():
    import random
    resultado = random.choice(["cara", "cruz"])

    if resultado == "cara":
        print('Ha salido Cara')

    else:
        print('Ha salido Cruz')

coin_flip()