<script>
    export let texto = 'Botón'
    export let color = 'blue'
</script>

<button style="--btn-color:{color}">
	{texto}
</button>

<style>
	button {
        color:white;
        background-color:var(--btn-color);
    }
</style>