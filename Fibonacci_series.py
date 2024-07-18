Python 3.11.9 (tags/v3.11.9:de54cf5, Apr  2 2024, 10:12:12) [MSC v.1938 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> n = int(input("value: "))
... a=0 
... b=1
... count = 0
... if n <= 0:
...     print("-ve value")
... elif n == 1:
...     print(a)
... else:
...     print("series:")
...     while count < n:
...         print(a)
...         v = a + b
...         a = b
...         b = v
