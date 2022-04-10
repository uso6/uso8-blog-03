# uso8-blog-01
Spring Bootの勉強で作った試験用ブログアプリ。  
"Home"、"Blog一覧"、"Blog詳細"、"Blog投稿"の4ページのみで構成。  
  
### 2022/4/10  
Spring Securityを追加して、"Blog投稿"をするためのユーザー認証を追加。  
パスワードエンコードは未実装。   

# 使い方
1.Repositryからプロジェクトのコピー  
```git clone https://github.com/uso6/uso8-blog-01.git```  
  
2.Spring Bootアプリの実行(※)  
```gradle bootrun```  
  
※ポート80で動作するため、root権限またはケーパビリティの設定で特権ポートへのアクセスが必要。
