package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3abada5a;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16827
 */
public class Galileo extends EntityType
{
    /** Default constructor */
    public Galileo()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)13); // uid 16824, Science satellite
        setSpecific((byte)3); // uid 16827, Galileo
    }
}
