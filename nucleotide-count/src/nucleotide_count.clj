(ns nucleotide-count
  (:refer-clojure :exclude [count]))

(def base { \A 0 \T 0 \C 0 \G 0})

(defn nucleotide-counts
  [str]
  (into base (frequencies (into [] str))))

(defn count
  [nuc s]
  {:pre [(contains? #{\A \C \G \T} nuc)]}
  (get (nucleotide-counts s) nuc))
