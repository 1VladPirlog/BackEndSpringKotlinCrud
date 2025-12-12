package com.vlad.backenddemo

import org.springframework.stereotype.Service

@Service
class ItemService(private val repository: ItemRepository) {

    fun findAll(): List<Item> = repository.findAll()

    fun findById(id: Long): Item =
        repository.findById(id).orElseThrow { RuntimeException("Item not found") }

    fun create(item: Item): Item = repository.save(item)

    fun update(id: Long, updated: Item): Item {
        val existing = findById(id)
        val newItem = existing.copy(
            name = updated.name,
            price = updated.price
        )
        return repository.save(newItem)
    }

    fun delete(id: Long) = repository.deleteById(id)
}
