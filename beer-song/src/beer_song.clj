(ns beer-song)

(defn many-bottles
  [n]
  (str n " bottles of beer on the wall, " n " bottles of beer.\nTake one down and pass it around, " (dec n) " bottles of beer on the wall.\n"))

(defn verse
  [n]
  (case n
        0 "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"

        1 "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"

        2 "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
        (many-bottles n)))

(defn sing
  ([n] (sing n 0))
  ([n n1] (->> (range n (dec n1) -1)
               (map verse)
               (clojure.string/join "\n"))))
