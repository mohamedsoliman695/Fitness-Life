<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <androidx.gridlayout.widget.GridLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:clickable="true"
        android:focusable="true"


        app:layout_column="0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"

        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.5"
        app:layout_row="0"
        app:orientation="vertical" >

        <ImageView
            android:id="@+id/imageView2"
            android:layout_width="match_parent"
            android:layout_height="match_parent"

            app:layout_column="0"
            app:layout_columnWeight="1"
            android:scaleX="2.8"
            android:scaleY="1"
            android:scaleType="fitXY"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_gravity="fill"
            app:layout_row="0"
            app:layout_rowWeight="1"
            app:srcCompat="@mipmap/signindoctor2foreground" />

        <TextView
            android:id="@+id/textView"
            android:layout_width="429dp"
            android:layout_height="84dp"
            android:text="مرحبا بك"
            android:textColor="#00796B"
            android:textSize="50dp"
            android:fontFamily="@font/robotocondensedbold"
            app:layout_column="0"
            app:layout_row="0"
            android:translationY="-10dp" />

        <TextView
            android:id="@