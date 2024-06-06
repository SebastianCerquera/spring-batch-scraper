package de.codecentric.batch.filetodb.repository.opensearch;

import de.codecentric.batch.filetodb.domain.Document;
import de.codecentric.batch.filetodb.domain.Text;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RepositoryDocument extends ElasticsearchRepository<Document, String> {}
