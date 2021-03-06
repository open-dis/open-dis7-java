package edu.nps.moves.dis7.entities.ltu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@379ab47b;
 * Country: Lithuania (LTU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25617
 */
public class CargoTanker extends EntityType
{
    /** Default constructor */
    public CargoTanker()
    {
        setCountry(Country.LITHUANIA_LTU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 25617, Cargo/Tanker
    }
}
