# MOOC-Design-Pattern

這是專門為磨課師課程「軟體設計樣式」所設計的程式碼，裡面的程式碼都是「**半成品**」。

打開 ./src 下的程式碼就看到每個設計樣式（作業）的提示程式碼。

修習以下課程的學生可以參考此程式碼
1. 軟體工程聯盟 2016/9 開課，課名：軟體設計 III- 軟體設計 (https://sec.openedu.tw/courses/course-v1:SEC+DP01+2016_Summer/about)
2. OpenEdu 2017/8 開課, 課名：軟體設計樣式 (https://www.openedu.tw/course.jsp?id=375)

若您是老師，可來信索取解答：nlhsueh@mail.fcu.edu.tw

## Exercise

### Strategy

1. 應用 Strategy 設計樣式，撰寫排序程式
2. 至少應用兩個排序演算法
3. 排序演算法及程式可採用網路資源，但需套用 Strategy 測試樣式

### Factory Method
1. 一個應用程式 App 總會用到 Doc 物件協助儲存資料
2. Doc 會有很多不同的形態，例如 text, latex, word 等
3. 不同的 App 會用到不同的 Doc, 由各自不同的 App 來決定
4. 請用 Factory method 來撰寫此程式

### Observer
1. 設計一個計數器，按下 + 的 button 後計數器會加一，按下 reset 後會歸零。計數器有兩個 view: 中央監視器（Monitor）與手錶（Watch）。
2. 請用 Observer 設計樣式，並用 Java Swing 模擬。

### Adaptor
1. Java 過去的集合型態(collection)都實踐 Enumeration 的介面,但新版的則開始使用 Iterator 的介面,我們需要一個 Enumeration 轉 Iterator 的 Adaptor, 請設計之。(Target 為 Iterator)
2. Hint: Iterator 內的 hasNext() 相當於 Enumeration 內的 hasMoreElement()。Iterator 內的 next() 相當於 Enumeration 內的 nextElement()
3. 有一類別 School, 內有方法 getAverage(Iterator)  會把 iterator 內的成績（Grade 物件）加總平均。有一個 Vector 物件內有 一群 Grade，但 Vector 無法回傳 iterator 物件，只能回傳 enmeration 物件。請利用上述的 adapter 物件來解決此問題

### Composite
目錄（Folder）與檔案（File）可以用 Composite 來設計，每一個 File 檔案有檔案大小（size），每一個 Folder 可以加上很多 Folder 或是 File，其檔案大小為其所包含的檔案大小之總和。FileManager 可以對 AbstractFile 詢問其檔案總大小。請撰寫程式實驗之。

### Decorator

聖誕樹 (ChrismasTree) 上面有許多的裝飾品，包含鈴鐺（Bell），糖果（Candy），與禮物（Gift），請用 Decorator 樣式設計之。所有的聖誕樹都會支援 sing() 的方法，
1. 聖誕樹：I am a Chrismas tree
2. 有鈴鐺的聖誕樹：I have a bell, I am a Chrismas tree
3. 有糖果和鈴鐺的聖誕樹：I have a candy, I have a bell, I am a Chrismas tree


