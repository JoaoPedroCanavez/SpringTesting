/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.watchmaniac.service;

/**
 *
 * @author jsant
 */
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
