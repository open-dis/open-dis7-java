package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@72ade7e3
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 16328
 */
public class FighterAirDefense extends EntityType
{
    public FighterAirDefense()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 16328, Fighter/Air Defense
    }
}
