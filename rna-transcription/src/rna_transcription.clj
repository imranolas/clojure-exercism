(ns rna-transcription)

(def rna-map {
   \C \G
   \G \C
   \A \U
   \T \A
  })

(defn map-to-rna [dna]
  {:post [%]}
  (rna-map dna))

(defn to-rna
  [dna]
  (apply str (map map-to-rna dna)))
