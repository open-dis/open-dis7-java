package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@c8c12ac;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30092
 */
public class CargoTanker extends EntityType
{
    /** Default constructor */
    public CargoTanker()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 30092, Cargo/Tanker
    }
}
