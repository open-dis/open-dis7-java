package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66c61024;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16828
 */
public class SohoCluster extends EntityType
{
    /** Default constructor */
    public SohoCluster()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)13); // uid 16824, Science satellite
        setSpecific((byte)4); // uid 16828, Soho & Cluster
    }
}
