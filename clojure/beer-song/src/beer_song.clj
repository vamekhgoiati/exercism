(ns beer-song)

(defn verse
  "Returns the nth verse of the song."
  [num]
  (cond
    (> num 2) (str (format "%s bottles of beer on the wall, %s bottles of beer.\n"  num num)
                   (format "Take one down and pass it around, %s bottles of beer on the wall.\n" (dec num)))
    (= num 2) (str "2 bottles of beer on the wall, 2 bottles of beer.\n"
                   "Take one down and pass it around, 1 bottle of beer on the wall.\n")
    (= num 1) (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
                   "Take it down and pass it around, no more bottles of beer on the wall.\n")
    :else (str "No more bottles of beer on the wall, no more bottles of beer.\n"
               "Go to the store and buy some more, 99 bottles of beer on the wall.\n")))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (sing start 0))
  ([start end]
   (->> (range start (dec end) -1)
        (map verse)
        (clojure.string/join "\n"))))