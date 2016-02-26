(ns bob
    (:gen-class))

(defn- silence? [input] (clojure.string/blank? input))
(defn- has-letters? [input] (boolean (re-find #"[a-zA-Z]" input)))
(defn- question? [input] (clojure.string/ends-with? input "?"))
(defn- shouting? [input] (and
                           (= input (clojure.string/upper-case input))
                           (has-letters? input)))

(defn response-for [input]
  (cond
    (silence? input) "Fine. Be that way!"
    (shouting? input) "Whoa, chill out!"
    (question? input) "Sure."
    :else "Whatever."))
