comp = ['abcdefghijklmnop']
vencedor1 = ''
vencedor2 = ''

turno = 1
lst = []
for i in range(3):
  lst.append(list(map(int, str(input()).split())))
  
''' for i in lst:
    if turno <= 8:
      vencedor1 += str(comp[turno * 2]) if i[0] < i[1] else str(comp[(turno * 2) - 1])
    elif turno <= 12:
      vencedor2 += str(vencedor1[turno * 2]) if i[0] < i[1] else str(vencedor1[(turno * 2) - 1])
    elif turno <= 14:
       vencedor3 += str(vencedor2[turno * 2]) if i[0] < i[1] else str(vencedor2[(turno * 2) - 1])
    else:
       print("Fora do escopo")

print(vencedor3) '''
