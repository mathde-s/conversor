def metros_para_centimetros(metros):
    return metros * 100

def metros_para_milimetros(metros):
    return metros * 1000

def metros_para_quilometros(metros):
    return metros / 1000

def metros_para_pes(metros):
    return metros * 3.28084

def metros_para_jardas(metros):
    return metros * 1.09361

def metros_para_milhas(metros):
    return metros / 1609.344

def exibir_conversoes(metros):
    print(f"\nConversões para {metros:.2f} metros:")
    print(f"Centímetros: {metros_para_centimetros(metros):.2f} cm")
    print(f"Milímetros: {metros_para_milimetros(metros):.2f} mm")
    print(f"Quilômetros: {metros_para_quilometros(metros):.5f} km")
    print(f"Pés: {metros_para_pes(metros):.2f} ft")
    print(f"Jardas: {metros_para_jardas(metros):.2f} yd")
    print(f"Milhas: {metros_para_milhas(metros):.5f} mi")

def main():
    try:
        metros = float(input("Digite a medida em metros: "))
        exibir_conversoes(metros)
    except ValueError:
        print("Por favor, insira um número válido!")
