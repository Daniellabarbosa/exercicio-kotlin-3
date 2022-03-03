fun menu() {

    val listEstoque = mutableListOf<String>()




    while (true){
    println ("ESTOQUE")
    println ("Digite uma das opções abaixo")
    println("1-ADD = Adcionar um novo produto")
    println("2-EDIT = Editar um produto")
    println("3-LISTA = Ver todos os produtos")
    println("4-DEL = Remover um produto")
    println("5-SAIR = Sair do menu")


        val opc = readLine()!!.toInt()

        println("\n")

        when(opc){

           1 -> {
                print("Digite um produto para ser adicionado no estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Produto inválido")
                }else{
                    listEstoque.add(item)
                    println("Produto inserido com sucesso!")
                }

            }

            2 -> {
                print("Digite o produto que será removido do estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Produto inválido")
                }else{
                    if(listEstoque.contains(item)){
                        listEstoque.remove(item)
                        println("O produto $item foi removido com sucesso")
                    }else{
                        println("O produto $item não existe na lista")
                    }
                }
            }

            3 -> {
                print("Selecione um produto de 0 a ${listEstoque.size - 1}")
                val pos = readLine()!!.toInt()

                if(pos in 0..(listEstoque.size - 1)){
                    print("Digite o produto que a ser atualizado: ")
                    val item = readLine()!!

                    listEstoque[pos] = item
                }else{
                    println("Esse produto não existe")
                }
            }


            4 -> {
                if(listEstoque.isEmpty()){
                    println("O estoque está vazio")
                }else{
                    println("**Itens do estoque**")

                    listEstoque.forEach {
                        println(it)
                    }
                }
            }

            else -> break

        }

    }

}