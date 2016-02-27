(ns anagram
  (:require [clojure.string :refer [lower-case]]))

(defn sort-and-lower [s]
  (->>
    s
    (lower-case)
    (sort)
    (apply str)))

(defn is-anagram [s1 s2]
  (= (sort-and-lower s1) (sort-and-lower s2)))

(defn is-same [s1 s2]
  (= (lower-case s1) (lower-case s2)))

(defn anagrams-for [s coll]
  (filter
    #(and
      (not (is-same s %))
      (is-anagram s %))
    coll))
