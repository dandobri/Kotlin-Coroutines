import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel

typealias ImageGenerator = (query: String) -> ByteArray

class ImageProcessor(
    parallelism: Int,
    requests: ReceiveChannel<String>,
    publications: SendChannel<Pair<String, ByteArray>>,
    generator: ImageGenerator,
) {
    fun run(scope: CoroutineScope) {
    }
}
