/*
 * MIT License
 *
 * Copyright (c) 2017 HIROCCH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.hirocch;

import java.io.File;

/**
 * ファイル名デモクラス。
 *
 * @author hirocch
 */
public class FilenameDemo {
    /**
     * フルパスのファイル名
     */
    private String fullPath;

    /**
     * コンストラクタ
     *
     * @param fullPath フルパスのファイル名
     */
    public FilenameDemo(String fullPath) {
        this.fullPath = fullPath;
    }

    /**
     * ファイル名の拡張子を取得
     *
     * @return ファイル名の拡張子
     */
    public String getExtension() {
        int dot = fullPath.lastIndexOf(".");
        return fullPath.substring(dot + 1);
    }

    /**
     * ファイル名を取得
     *
     * @return ファイル名
     */
    public String getFilename() {
        int dot = fullPath.lastIndexOf(".");
        int sep = fullPath.lastIndexOf(File.separator);
        return fullPath.substring(sep + 1, dot);
    }

    /**
     * ファイルパスを取得
     *
     * @return ファイルパス
     */
    public String getPath() {
        int sep = fullPath.lastIndexOf(File.separator);
        return fullPath.substring(0, sep);
    }

    /**
     * メイン
     *
     * @param args コマンドラインパラメータ
     */
    public static void main(String[] args) {
        final String fullPath = "C:\\temp\\demo\\index.html";
        System.out.println("フルパス" + fullPath);

        FilenameDemo demo = new FilenameDemo(fullPath);
        System.out.println("拡張子 = " + demo.getExtension());
        System.out.println("ファイル名 = " + demo.getFilename());
        System.out.println("ファイルパス = " + demo.getPath());
    }
}
