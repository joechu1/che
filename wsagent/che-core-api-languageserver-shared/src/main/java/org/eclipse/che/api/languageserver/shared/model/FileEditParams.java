/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.languageserver.shared.model;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.TextEdit;

public class FileEditParams {
  /** The workspace relative path of the file */
  private String uri;
  /** A list of TextEdits to be applied to the file */
  private List<TextEdit> edits;

  public FileEditParams() {}

  public FileEditParams(String path, List<TextEdit> edits) {
    this.uri = path;
    this.edits = edits;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public List<TextEdit> getEdits() {
    return edits;
  }

  public void setEdits(List<TextEdit> edits) {
    this.edits = new ArrayList<>(edits);
  }
}
