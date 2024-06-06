package de.codecentric.batch.filetodb.repository.opensearch;

import de.codecentric.batch.filetodb.domain.Text;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RepositoryText extends ElasticsearchRepository<Text, String> {}
