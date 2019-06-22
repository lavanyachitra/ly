xz=input()
nm=len(xz)
l=[]
v=""
for i in xz:
    l.append(i)
for i in range(nm):
    v+=l.pop()
if v==xz:
    print('YES')
else:
    print('NO')
