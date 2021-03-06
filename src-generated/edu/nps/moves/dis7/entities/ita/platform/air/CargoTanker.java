package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@312ab28e;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18311
 */
public class CargoTanker extends EntityType
{
    /** Default constructor */
    public CargoTanker()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18311, Cargo/Tanker
    }
}
