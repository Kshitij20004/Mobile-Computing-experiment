package me.arwazkhan.bookhub.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lme/arwazkhan/bookhub/adapter/DashboardRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lme/arwazkhan/bookhub/adapter/DashboardRecyclerAdapter$DashboardViewHolder;", "context", "Landroid/content/Context;", "itemList", "Ljava/util/ArrayList;", "Lme/arwazkhan/bookhub/model/Book;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DashboardViewHolder", "app_debug"})
public final class DashboardRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<me.arwazkhan.bookhub.adapter.DashboardRecyclerAdapter.DashboardViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<me.arwazkhan.bookhub.model.Book> itemList = null;
    
    public DashboardRecyclerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<me.arwazkhan.bookhub.model.Book> itemList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.arwazkhan.bookhub.adapter.DashboardRecyclerAdapter.DashboardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    me.arwazkhan.bookhub.adapter.DashboardRecyclerAdapter.DashboardViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lme/arwazkhan/bookhub/adapter/DashboardRecyclerAdapter$DashboardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imgBookImage", "Landroid/widget/ImageView;", "getImgBookImage", "()Landroid/widget/ImageView;", "llContent", "Landroid/widget/LinearLayout;", "getLlContent", "()Landroid/widget/LinearLayout;", "txtBookAuthor", "Landroid/widget/TextView;", "getTxtBookAuthor", "()Landroid/widget/TextView;", "txtBookName", "getTxtBookName", "txtBookPrice", "getTxtBookPrice", "txtBookRating", "getTxtBookRating", "app_debug"})
    public static final class DashboardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView txtBookName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView txtBookAuthor = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView txtBookPrice = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView txtBookRating = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imgBookImage = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.LinearLayout llContent = null;
        
        public DashboardViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTxtBookName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTxtBookAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTxtBookPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTxtBookRating() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImgBookImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getLlContent() {
            return null;
        }
    }
}