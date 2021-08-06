Thread oluşturmak için Runnable interface ve thread sınıflarını kullanabiliriz.<br/>
Runnable sınıfını implemente ederek ve run metodunu ovverride ederek yeni bir task oluşturulur.<br/> Oluşturulan bu taskı
bir thread objesine verip çalıştırmasını isteriz.<br/>
Thread çalıştığı zaman run metodu çağırılır.<br/>
Thread objesini newleyerek oluştururuz ve start metedu ile çalışmasını sağlarız.<br/>
Runnable implemente ettiğimiz zaman, oluşturduğumuz threadler JVM arka planında isteğine göre planlanır ve bu nedenden dolayı
her seferinde farklı sıralarda çıktı elde etmiş oluruz.<br/>
Multithreading, çoğu yazılım dili tarafından desteklenen temel programlama prensibidir ve bir programda aynı zamanda birden fazla işin yapılabilmesini sağlar. Bir kod parçası bir işlemi gerçekleştirirken aynı anda ona paralel olarak bir başka kod parçasının da çalışmasını sağlar.<br/>
Thread kullanırsak; Kaynak paylaşımı, daha az bekleme süresi, daha verimli donanım kullanımı gibi faydalar sağlar.<br/>
MultiThreading yapısı ile bütün işlem parçacıklarının aynı anda çalışmaları sağlanır.<br/>
MultiThreading ile belli bir miktarda hız kazanılır.<br/>
MultiThreading yapısında tek process oluşturulduğu için daha az kaynak tüketir.<br/>
MultiThreading ile tek bir process üzerinde birden fazla işlem parçacığı oluşturulur.<br/>

<ul>
  <li>https://www.geeksforgeeks.org/multithreading-in-java/#:~:text=Multithreading%20is%20a%20Java%20feature,weight%20processes%20within%20a%20process
</li>
  <li>https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-1-k%C4%B1s%C4%B1m-40904a219a18
</li>
  <li>https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-2-k%C4%B1s%C4%B1m-6cd8411f8b2e
</li>
  <li>https://thecodeprogram.com/multithreading-ve-multiprocessing-nedir--farklari-nelerdir-
</li>
</ul>
