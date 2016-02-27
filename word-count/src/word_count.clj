(ns word-count)

(def non-word-re #"\W+")

(defn words [s]
  (clojure.string/split
    (clojure.string/lower-case s)
    non-word-re))

(defn word-count [w]
  (frequencies (words w)))
