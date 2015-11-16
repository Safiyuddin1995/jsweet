/* Copyright 2015 CINCHEO SAS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsweet.transpiler.candies;

import java.util.LinkedList;
import java.util.List;

/**
 * A class that is serialized to store information on the processed candies.
 */
class CandiesStore {
	List<CandyDescriptor> candies = new LinkedList<>();

	public CandiesStore() {
		this(new LinkedList<CandyDescriptor>());
	}

	public CandiesStore(List<CandyDescriptor> candiesDescriptors) {
		this.candies = candiesDescriptors;
	}

	@Override
	public int hashCode() {
		return candies.size();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CandiesStore)) {
			return false;
		}

		CandiesStore other = (CandiesStore) obj;
		return candies.size() == other.candies.size() && candies.containsAll(other.candies);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "=" + candies;
	}
}