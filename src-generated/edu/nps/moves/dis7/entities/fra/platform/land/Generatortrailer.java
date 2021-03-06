package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@236e3f4e;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 15693
 */
public class Generatortrailer extends EntityType
{
    /** Default constructor */
    public Generatortrailer()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 15693, Generator trailer
    }
}
