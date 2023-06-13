module Main where

encolar e c = c ++ [e]

desencolar (c : cs) = (c, cs)

apilar e c = e : c

desapilar (p : ps) = (p, ps)

cola = [1, 2, 3]

pila = [3, 2, 1]

n = 4

main = do
  print ("Cola")
  print (cola)
  let nuevaCola = encolar n cola
  print ("Encolar")
  print (nuevaCola)
  print ("Desencolar")
  print (desencolar nuevaCola)

  print ("Pila")
  print (pila)
  let nuevaPila = apilar n pila
  print ("Apilar")
  print (nuevaPila)
  print ("Desapilar")
  print (desapilar nuevaPila)

-- main = print (desapilar lista)