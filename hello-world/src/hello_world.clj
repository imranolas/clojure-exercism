(ns hello-world
  (:gen-class))

(defn hello
  "Says hello world"
  ([]
   (str "Hello, World!"))
  ([text]
   (str "Hello, " text "!")))