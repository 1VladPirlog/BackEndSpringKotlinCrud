package com.vlad.backenddemo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/items")
class ItemController(private val service: ItemService) {

    @GetMapping
    fun getAll(): List<Item> = service.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Item = service.findById(id)

    @PostMapping
    fun create(@RequestBody item: Item): Item = service.create(item)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody item: Item): Item =
        service.update(id, item)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = service.delete(id)
}
